package com.amazon.ata.trees.helper;

import com.amazon.ata.trees.activity.ClearContactsActivity;
import com.amazon.ata.trees.activity.GetContactsStartingAtActivity;
import com.amazon.ata.trees.dependency.DaggerServiceComponent;
import com.amazon.ata.trees.dependency.ServiceComponent;
import com.amazon.ata.trees.activity.AddContactActivity;
import com.amazon.ata.trees.activity.GetContactsActivity;

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
