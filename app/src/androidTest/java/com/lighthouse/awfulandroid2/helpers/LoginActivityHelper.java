package com.lighthouse.awfulandroid2.helpers;

import com.lighthouse.awfulandroid2.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsNot.not;

public class LoginActivityHelper {

    public static void assertButtonEnabled(int buttonId, boolean isEnabled) {
        onView(withId(buttonId)).check(matches(isEnabled ? isEnabled() : not(isEnabled())));
    }

    public static void assertButtonDisplayed(int buttonId, boolean isDisplayed) {
        onView(withId(buttonId)).check(matches(isDisplayed ? isDisplayed() : not(isDisplayed())));
    }

    public static void assertWelcomeMessageDisplayed() {
        onView(withText(R.string.login_welcome)).check(matches(isDisplayed()));
    }

    public static void clickStuckButton() {
        onView(withId(R.id.stuck_button)).perform(click());
    }

    public static void clickToolbar() {
        onView(withId(R.id.toolbar)).perform(click());
    }

    public static void closeStuckDialog() {
        onView(withText(R.string.stuck_button_got_it)).perform(click());
    }

    public static void clickLoginButton() {
        onView(withId(R.id.login_button)).perform(click());
    }

    public static void enterName(String name) {
        onView(withId(R.id.enter_name_editText)).perform(typeText(name));
    }

    public static void assertStuckDialogDisplayed(boolean displayed) {
        onView(withText("Stuck?")).check(matches(displayed ? isDisplayed() : not(isDisplayed())));
        onView(withText(R.string.login_stuck_text)).check(matches(displayed ? isDisplayed() : not(isDisplayed())));
    }
}
