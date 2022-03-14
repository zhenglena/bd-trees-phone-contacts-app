package com.amazon.ata.trees.classroom.helper;

import com.amazon.ata.trees.classroom.activity.ClearContactsActivity;
import com.amazon.ata.trees.classroom.activity.GetContactsStartingAtActivity;
import com.amazon.ata.trees.classroom.dependency.DaggerServiceComponent;
import com.amazon.ata.trees.classroom.dependency.ServiceComponent;
import com.amazon.ata.trees.classroom.activity.AddContactActivity;
import com.amazon.ata.trees.classroom.activity.GetContactsActivity;

public final class ActivityProvider {
    private static final ServiceComponent DAGGER = DaggerServiceComponent.create();

    private ActivityProvider() {
    }

    public static GetContactsActivity provideGetContactsActivity() {
        return DAGGER.provideGetContactsActivity();
    }

    public static AddContactActivity provideAddContactActivity() {
        return DAGGER.provideAddContactActivity();
    }

    public static GetContactsStartingAtActivity provideGetContactsStartingAtActivity() {
        return DAGGER.provideGetContactsStartingAtActivity();
    }

    public static ClearContactsActivity provideClearContactsActivity() {
        return DAGGER.provideClearContactsActivity();
    }

}
