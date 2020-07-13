package com.nemesis.quiz.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import com.nemesis.quiz.R
import com.nemesis.quiz.adapters.CategoriesAdapter
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.groupiex.plusAssign
import kotlinx.android.synthetic.main.activity_categories_selector.*


/**
 *
 * @property groupAdapter GroupAdapter<GroupieViewHolder> is the view holder for each item within
 * the recycler view. In this case is the categories.
 */
class CategoriesSelectorActivity : AppCompatActivity() {

    companion object {
        var numberOfItemsSelected = 0
        const val TAG = "CategoriesSelector"
        val selectedCategories = mutableListOf<String>()
    }

    private lateinit var groupAdapter: GroupAdapter<GroupieViewHolder>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        setContentView(R.layout.activity_categories_selector)
        setupCategorySelection()
    }


    /**
     * Sets up all UI functions of the category selection
     */
    private fun setupCategorySelection() {

        btn_play_categories_selector.setOnClickListener {
            if (numberOfItemsSelected >= 1) {
                val intent = Intent(this, GameModeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Log.v(TAG, "Please select at least 1 category")
            }
        }

        groupAdapter = GroupAdapter<GroupieViewHolder>().apply {
            spanCount = 2
        }

        recyclerview_category_view.apply {
            layoutManager =
                GridLayoutManager(this@CategoriesSelectorActivity, groupAdapter.spanCount)
                    .apply {
                    spanSizeLookup = groupAdapter.spanSizeLookup
                }

            adapter = groupAdapter


            generateAdapterItems()

            // Adds a divider between each 2 categories shown
            recyclerview_category_view.addItemDecoration(
                DividerItemDecoration(
                    this@CategoriesSelectorActivity,
                    DividerItemDecoration.VERTICAL
                )
            )
        }
    }

    /**
     * Generates categories to be selected
     */
    private fun generateAdapterItems() {
        for (i in CategoriesAdapter.listOfCategories) {
            groupAdapter += CategoriesAdapter()
        }
    }
}
