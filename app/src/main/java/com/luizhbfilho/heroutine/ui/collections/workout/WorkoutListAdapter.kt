package com.luizhbfilho.heroutine.ui.collections.workout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.luizhbfilho.heroutine.core.model.WorkoutItem
import com.luizhbfilho.heroutine.databinding.WorkoutItemBinding

class WorkoutListAdapter(
    private val viewModel: WorkoutListViewModel
    ): RecyclerView.Adapter<WorkoutListAdapter.ViewHolder>() {

    private val asyncListDiffer: AsyncListDiffer<WorkoutItem> = AsyncListDiffer(this, DiffCallback)

    class ViewHolder(
        private val binding: WorkoutItemBinding,
        private val viewModel: WorkoutListViewModel
    ): RecyclerView.ViewHolder(binding.root){

        fun bind(workout: WorkoutItem) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = WorkoutItemBinding.inflate(layoutInflater, parent, false)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    object DiffCallback : DiffUtil.ItemCallback<WorkoutItem>() {
        override fun areItemsTheSame(oldItem: WorkoutItem, newItem: WorkoutItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: WorkoutItem, newItem: WorkoutItem): Boolean {
            return oldItem
        }

    }
}