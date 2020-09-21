package com.example.firstactivity.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstactivity.Model.Book;
import com.example.firstactivity.R;

import java.util.ArrayList;

public class PaymentListAdapter extends RecyclerView.Adapter<PaymentListAdapter.ViewHolder> {

    private ArrayList<Book> bookArrayList;

    public PaymentListAdapter(ArrayList<Book> bookArrayList) {
        this.bookArrayList = bookArrayList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.payment_list_item, parent, false);
        return new PaymentListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(bookArrayList.get(position).getName());
        holder.author.setText(bookArrayList.get(position).getAuthor());
        holder.id.setText(bookArrayList.get(position).getId());
        holder.quantity.setText(String.valueOf(bookArrayList.get(position).getQuantity()));
        holder.price.setText(String.valueOf(bookArrayList.get(position).getPrice()));
    }

    @Override
    public int getItemCount() {
        return bookArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView author;
        TextView id;
        TextView quantity;
        TextView price;
        Button removeItem;
        Button decrease;
        Button increase;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.book_name);
            author = itemView.findViewById(R.id.book_author);
            id = itemView.findViewById(R.id.book_id);
            price = itemView.findViewById(R.id.book_price);
            quantity = itemView.findViewById(R.id.quantity);
            increase = itemView.findViewById(R.id.increase_quantity);
            decrease = itemView.findViewById(R.id.decrease_quantity);
            removeItem = itemView.findViewById(R.id.remove_item);
        }
    }

}
