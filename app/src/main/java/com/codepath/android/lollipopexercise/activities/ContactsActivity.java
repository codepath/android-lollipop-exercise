package com.codepath.android.lollipopexercise.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.codepath.android.lollipopexercise.R;
import com.codepath.android.lollipopexercise.adapters.ContactsAdapter;
import com.codepath.android.lollipopexercise.models.Contact;

import java.util.ArrayList;
import java.util.List;


public class ContactsActivity extends Activity {
    private ContactsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        // Find RecyclerView and bind to adapter
        final RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

        // allows for optimizations
        rvContacts.setHasFixedSize(true);

        // Define 2 column grid layout
        final GridLayoutManager layout = new GridLayoutManager(ContactsActivity.this, 2);

        // Unlike ListView, you have to explicitly give a LayoutManager to the RecyclerView to position items on the screen.
        // There are three LayoutManager provided at the moment: GridLayoutManager, StaggeredGridLayoutManager and LinearLayoutManager.
        rvContacts.setLayoutManager(layout);

        // get data
        List<Contact> contacts = getContacts();

        // Create an adapter
        mAdapter = new ContactsAdapter(ContactsActivity.this, contacts);

        // Bind adapter to list
        rvContacts.setAdapter(mAdapter);
    }

    private List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(1, "Adam", R.drawable.contact_one, "4153508881"));
        contacts.add(new Contact(2, "Sarah", R.drawable.contact_two, "4153508882"));
        contacts.add(new Contact(3, "Bob", R.drawable.contact_three, "4153508883"));
        contacts.add(new Contact(4, "John", R.drawable.contact_four, "4153508884"));
        contacts.add(new Contact(5, "Jill", R.drawable.contact_five, "4153508885"));
        contacts.add(new Contact(6, "Mark", R.drawable.contact_six, "4153508886"));
        contacts.add(new Contact(7, "Susan", R.drawable.contact_seven, "4153508887"));
        contacts.add(new Contact(8, "Ryan", R.drawable.contact_eight, "4153508888"));
        contacts.add(new Contact(9, "Jeff", R.drawable.contact_nine, "4153508889"));
        return contacts;
    }
}
