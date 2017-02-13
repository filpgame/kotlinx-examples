package com.filpgame.kotlinx.ui.list

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.filpgame.kotlinx.R
import kotlinx.android.synthetic.main.list_row_user.view.*

/**
 * @author Felipe Rodrigues
 * @since 13/02/2017
 */
class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    val users = mutableListOf<User>()

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.view.userNameTextView.text = users[position].name
        holder.view.userOccupationTextView.text = users[position].occupation
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_row_user, parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int = users.count()

    class UserViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}