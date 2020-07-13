package com.nemesis.quiz.adapters

import com.nemesis.quiz.R
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.result_row.view.*

/**
 *
 * @property question String is the question that was asked
 * @property result Boolean is the result of whether user got question correct or incorrect
 * @constructor
 */
class ResultAdapter(
    private val questionNumberAsked: String,
    private val question: String,
    private val result: Boolean
) : Item<GroupieViewHolder>() {

    /**
     *
     * @return Int returns recycler view
     */
    override fun getLayout(): Int {
        return R.layout.result_row
    }

    /**
     *
     * @param viewHolder GroupieViewHolder is the view holder for the row in the recycler view
     * @param position Int is the position of the item/row within the recycler view
     */
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {

        viewHolder.itemView.result_row_question_number_tv.text = questionNumberAsked
        viewHolder.itemView.result_row_question_tv.text = question

        if (result){
            viewHolder.itemView.result_image.setImageResource(R.drawable.correct_icon)
        } else {
            viewHolder.itemView.result_image.setImageResource(R.drawable.incorrect_icon)
        }

    }

}