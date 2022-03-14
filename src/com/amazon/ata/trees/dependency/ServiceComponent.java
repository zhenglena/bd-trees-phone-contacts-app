package com.amazon.ata.trees.classroom.dependency;

import com.amazon.ata.trees.classroom.activity.AddContactActivity;
import com.amazon.ata.trees.classroom.activity.ClearContactsActivity;
import com.amazon.ata.trees.classroom.activity.GetContactsActivity;
import com.amazon.ata.trees.classroom.activity.GetContactsStartingAtActivity;

import dagger.Component;

import javax.inject.Singleton;

/**
 * Declares the dependency roots that Dagger will provide.
 */
@Singleton
@Component
public interface ServiceComponent {
    AddContactActivity provideAddContactActivity();

    GetContactsActivity provideGetContactsActivity();

    GetContactsStartingAtActivity provideGetContactsStartingAtActivity();

    ClearContactsActivity provideClearContactsActivity();

}
