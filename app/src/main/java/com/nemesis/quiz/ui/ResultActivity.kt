package com.nemesis.quiz.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import com.nemesis.quiz.R
import com.nemesis.quiz.adapters.ResultAdapter
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import kotlinx.android.synthetic.main.activity_result.*

/**
 *
 * @property groupAdapter GroupAdapter<GroupieViewHolder> the group adapter used for view holder
 * objects to display each result in a row within the recycler view.
 */
class ResultActivity : AppCompatActivity() {

    private val groupAdapter = GroupAdapter<GroupieViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        // Set recycler view adapter
        result_recycler_view.adapter = groupAdapter
        result_recycler_view.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
        displayQuizResult()
    }


    /**
     * Calculates result from the quiz completed by the user
     */
    private fun displayQuizResult() {

        var resultString: String
        var questionNumberAsked: String
        var questionNumber: Int
        var wasCorrect: Boolean
        val scoreResult = "Your score was \n ${GameModeActivity.score} "

        for ((i, result) in GameModeActivity.questions.withIndex()) {

            resultString = ""
            questionNumber = i + 1

            // Checks if user got question correct or not
            wasCorrect = result.answer == GameModeActivity.answersToQuestions[i]

            questionNumberAsked = "Question $questionNumber"

            resultString += "Answer was ${result.answer}" +
                    " and you put ${GameModeActivity.answersToQuestions[i]}"

            groupAdapter.add(ResultAdapter(questionNumberAsked,resultString, wasCorrect))

        }


        // Display users score
        result_score_tv.text = scoreResult

        // Play again button
        btn_play_again.setOnClickListener {
            val intent = Intent(this, CategoriesSelectorActivity::class.java)
            resultString = ""
            resetGame()
            startActivity(intent)
            finish()
        }
    }

    /**
     * Resets all score and questions for another quiz to be played
     */
    private fun resetGame() {
        for (question in GameModeActivity.questions) {
            question.questionChosen = false
        }
        CategoriesSelectorActivity.selectedCategories.clear()
        GameModeActivity.questions.clear()
        GameModeActivity.answersToQuestions.clear()
        GameModeActivity.score = 0
        groupAdapter.clear()
    }
}