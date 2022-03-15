package com.amazon.ata.trees.activity;

import com.amazon.ata.trees.dao.ContactDao;

import javax.inject.Inject;

/**
 * Handles requests to clear all phone contacts.
 */
public class ClearContactsActivity {

    private final ContactDao contactDao;

    /**
     * Contructs an activity with the given dao.
     *
     * @param contactDao The dao to use to clear contacts.
     */
    @Inject
    public ClearContactsActivity(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    /**
     * Removes all contacts.
     */
    public void handleRequest() {
        contactDao.clearContacts();
    }
}
