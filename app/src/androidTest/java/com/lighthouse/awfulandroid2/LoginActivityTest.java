package com.lighthouse.awfulandroid2;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.lighthouse.awfulandroid2.helpers.LoginActivityHelper.assertButtonDisplayed;
import static com.lighthouse.awfulandroid2.helpers.LoginActivityHelper.assertButtonEnabled;
import static com.lighthouse.awfulandroid2.helpers.LoginActivityHelper.assertStuckDialogDisplayed;
import static com.lighthouse.awfulandroid2.helpers.LoginActivityHelper.assertWelcomeMessageDisplayed;
import static com.lighthouse.awfulandroid2.helpers.LoginActivityHelper.clickStuckButton;
import static com.lighthouse.awfulandroid2.helpers.LoginActivityHelper.closeStuckDialog;
import static com.lighthouse.awfulandroid2.helpers.LoginActivityHelper.enterName;

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void testWelcomeTextIsDisplayed() throws Exception {
        assertWelcomeMessageDisplayed();
    }

    @Test
    public void testLoginButtonDisplayedAndDisabledByDefault() throws Exception {
        assertButtonDisplayed(R.id.login_button, true);
        assertButtonEnabled(R.id.login_button, false);
    }

    @Test
    public void testStuckButtonDisplayedAndEnabledByDefault() throws Exception {
        assertButtonDisplayed(R.id.stuck_button, true);
        assertButtonEnabled(R.id.stuck_button, true);
    }

    @Test
    public void testStuckButtonDisplaysHelpDialog() throws Exception {
        assertButtonEnabled(R.id.stuck_button, true);
        clickStuckButton();

        assertStuckDialogDisplayed(true);
    }

    @Test
    public void testStuckButtonDisabledAfterFirstClick() throws Exception {
        assertButtonEnabled(R.id.stuck_button, true);
        clickStuckButton();
        closeStuckDialog();

        assertButtonEnabled(R.id.stuck_button, false);
    }

    @Test
    public void testLoginButtonDisabledWhenNameEnteredIncorrectly() throws Exception {
        enterName("Homer Hickum");
        assertButtonEnabled(R.id.login_button, false);
    }

    @Test
    public void testLoginButtonEnabledWhenNameEnteredCorrectly() throws Exception {
        enterName("rocket.boy");
        assertButtonEnabled(R.id.login_button, true);
    }
}
