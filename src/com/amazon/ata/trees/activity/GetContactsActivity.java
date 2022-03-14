package com.amazon.ata.trees.classroom.activity;

import com.amazon.ata.trees.classroom.dao.ContactDao;
import com.amazon.ata.trees.classroom.model.Contact;
import com.amazon.ata.trees.classroom.model.Name;
import com.amazon.ata.trees.classroom.model.SortBy;
import com.amazon.ata.trees.classroom.model.SortOrder;

import java.util.SortedMap;
import javax.inject.Inject;

/**
 * Handles requests to get contacts.
 */
public class GetContactsActivity {

    private final ContactDao contactDao;

    /**
     * Constructs an activity with the given dao.
     * @param contactDao The dao to use to get contacts.
     */
    @Inject
    public GetContactsActivity(final ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    /**
     * Retrieve contacts in the given sort order. If no sort parameters are given, return the default sort order by
     * last name in ascending order.
     * @param sortBy Attribute to sort contacts by, e.g. first name, last name
     * @param sortOrder sort order to return contacts, either ascending or descending.
     * @return ordered map of contacts
     */
    public SortedMap<Name, Contact> handleRequest(final SortBy sortBy, final SortOrder sortOrder) {
        return contactDao.getContacts(sortBy, sortOrder);
    }
}
