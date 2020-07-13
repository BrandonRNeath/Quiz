package com.nemesis.quiz.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.nemesis.quiz.R
import com.nemesis.quiz.model.QuestionObject
import com.nemesis.quiz.model.Questions
import kotlinx.android.synthetic.main.activity_game_mode.*
import java.util.Collections.shuffle

class GameModeActivity : AppCompatActivity() {

    companion object {
        var score: Int = 0
        var questions = mutableListOf<QuestionObject>()
        var answersToQuestions = mutableListOf<String>()
    }

    private var nextQuestion = 0


    /**
     * Selects random questions from each category that was selected
     * @param category List<QuestionObject> is the list that stores the Question objects
     */
    private fun findRandom(category: List<QuestionObject> = listOf()) {

        var randomNumber: Int
        var foundDuplicate: Boolean

        // Generates a random number for a index from the category list
        randomNumber = category.indices.random()
        if (category[randomNumber].questionChosen) {
            foundDuplicate = true
            while (foundDuplicate) {
                randomNumber = category.indices.random()
                if (!category[randomNumber].questionChosen) {
                    foundDuplicate = false
                }
            }
        }
        questions.add(category[randomNumber])
        category[randomNumber].questionChosen = true
    }

    /**
     *  Generates the questions for ** quiz dependent off what categories that
     *  were selected by the user
     */
    private fun generateQuestions() {

        var j = 0
        var i = 0

        val numberOfQuestions = CategoriesSelectorActivity.selectedCategories.size * 3


        while (i < numberOfQuestions) {
            when (CategoriesSelectorActivity.selectedCategories[j]) {
                "History" -> findRandom(Questions.HISTORY)
                "Geography" -> findRandom(Questions.GEOGRAPHY)
                "Arts" -> findRandom(Questions.ARTS)
                "Music" -> findRandom(Questions.MUSIC)
                "General Knowledge" -> findRandom(Questions.GENERAL_KNOWLEDGE)
                "Sport" -> findRandom(Questions.SPORT)
                "Science" -> findRandom(Questions.SCIENCE)
                "Mythology" -> findRandom(Questions.MYTHOLOGY)
            }
            if (j + 1 == CategoriesSelectorActivity.selectedCategories.size) {
                j = 0
            } else {
                j++
            }
            i++
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_mode)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        generateQuestions()
        questions.shuffle()
        nextQuestion(nextQuestion)
        setupAnswerOptionListener();
    }


    /**
     *
     * @param pos Int is the index of the next question for the Quiz
     */
    private fun nextQuestion(pos: Int) {

        // If quiz is over result screen is shown
        if (pos == questions.size) {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
            finish()
        } else {

            val currentQuestion = "Question " + (pos + 1).toString()
            game_mode__question_number_tv.text = currentQuestion;
            // Next question is displayed
            game_mode_tv_question.text = questions[pos].question
            val buttons =
                listOf<Button>(btn_option_one, btn_option_two, btn_option_three, btn_option_four)
            shuffle(buttons)
            buttons[0].text = questions[pos].answer
            buttons[1].text = questions[pos].wrongOption1
            buttons[2].text = questions[pos].wrongOption2
            buttons[3].text = questions[pos].wrongOption3
        }
    }

    /**
     *
     * @param btn is the button that was selected by the user for their answer to
     * the question asked
     * @param pos Int is the current index of the question that is being asked
     */
    private fun checkResult(btn: Button, pos: Int) {

        answersToQuestions.add(btn.text.toString())

        // Checks against answer selected to the actual answer of the question
        if (btn.text == questions[pos].answer) {
            score++
        }
    }


    /**
     * Sets up the on click listeners for the answer options to question asked within
     * quiz
     */
    private fun setupAnswerOptionListener() {
        btn_option_one.setOnClickListener {
            checkResult(btn_option_one, nextQuestion)
            nextQuestion++
            nextQuestion(nextQuestion)
        }
        btn_option_two.setOnClickListener {
            checkResult(btn_option_two, nextQuestion)
            nextQuestion++
            nextQuestion(nextQuestion)
        }
        btn_option_three.setOnClickListener {
            checkResult(btn_option_three, nextQuestion)
            nextQuestion++
            nextQuestion(nextQuestion)
        }
        btn_option_four.setOnClickListener {
            checkResult(btn_option_four, nextQuestion)
            nextQuestion++
            nextQuestion(nextQuestion)
        }
    }
}

