package com.example.customadapterlistviewexample.adapters

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.lesson6.R
import com.example.lesson6.User
import com.example.lesson6.UsersList

class UserAdapter(private val context: UsersList, private val items: ArrayList<User>): BaseAdapter() {

    class ViewHolder{
        lateinit var name: TextView
        lateinit var descrioption: TextView
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var rowView = convertView
        var holder = ViewHolder()

        if (rowView == null){
            var inflater = context.layoutInflater
            rowView = inflater.inflate(R.layout.user_adapter_item, null, true)

            holder.name = rowView.findViewById<TextView>(R.id.name)
            holder.descrioption= rowView.findViewById<TextView>(R.id.description)

            rowView.setTag(holder)
        }
        else{
            holder = rowView.tag as ViewHolder
        }

        holder.name.text = items.get(position).name
        holder.descrioption.text = items.get(position).description

        return rowView!!
    }

    /*override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_item_list, null, true)

        val bandera = rowView.findViewById(R.id.bandera) as ImageView
        val campo1 = rowView.findViewById<TextView>(R.id.campo1)
        val campo2 = rowView.findViewById(R.id.campo2) as TextView

        campo1.text = items.get(position).campo1
        campo2.text = items.get(position).campo2

        if (items.get(position).bandera.equals("uk")){
            bandera.setImageResource(R.drawable.uk_flag)
        }
        else{
            bandera.setImageResource(R.drawable.es)
        }

        return rowView
    }*/



    override fun getItem(position: Int): User {
        return items.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return items.size
    }
}