package com.nemesis.quiz.adapters

import androidx.core.content.ContextCompat
import com.nemesis.quiz.R
import com.nemesis.quiz.ui.CategoriesSelectorActivity
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.category_row.view.*


class CategoriesAdapter() : Item<GroupieViewHolder>() {


    /**
     *
     * @return Int returns recycler view
     */
    override fun getLayout(): Int {
        return R.layout.category_row
    }

    companion object {
        // Images for Quiz categories
        val images = listOf(
            R.drawable.history,
            R.drawable.geography,
            R.drawable.art,
            R.drawable.music_symbol,
            R.drawable.general_knowledge,
            R.drawable.sport,
            R.drawable.science,
            R.drawable.mythology
        )
        val listOfCategories = listOf(
            "History", "Geography", "Arts", "Music", "General Knowledge",
            "Sport", "Science", "Mythology"
        )
    }


    /**
     *
     * @param viewHolder GroupieViewHolder is the holder of the item/row
     * @param position Int is the position of the item/row in the todo list
     */
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {


        viewHolder.itemView.tv_category_title.text = listOfCategories[position]
        viewHolder.itemView.iv_category_image.setImageDrawable(
            ContextCompat.getDrawable(viewHolder.itemView.context, images[position])
        )

        viewHolder.itemView.category_card.setOnClickListener {

            if (!viewHolder.itemView.category_card.isChecked) {
                viewHolder.itemView.category_card.isChecked = true
                CategoriesSelectorActivity.numberOfItemsSelected++
                CategoriesSelectorActivity.selectedCategories.add(
                    listOfCategories[position]
                )
            } else {
                viewHolder.itemView.category_card.isChecked = false
                CategoriesSelectorActivity.numberOfItemsSelected--
            }
        }
    }


    /**
     *
     * @param spanCount Int
     * @param position Int
     * @return Int returns half the span count
     */
    override fun getSpanSize(spanCount: Int, position: Int) = spanCount / 2

}