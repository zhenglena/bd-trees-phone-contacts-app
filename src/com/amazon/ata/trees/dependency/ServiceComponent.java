package com.amazon.ata.trees.dependency;

import com.amazon.ata.trees.activity.AddContactActivity;
import com.amazon.ata.trees.activity.ClearContactsActivity;
import com.amazon.ata.trees.activity.GetContactsActivity;
import com.amazon.ata.trees.activity.GetContactsStartingAtActivity;

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
