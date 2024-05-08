package com.example.labtesta1;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityActivityScenarioRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);
    @Test
    public void btnshape()
    {
        onView(ViewMatchers.withId(R.id.editTextText2)).perform(typeText("10"), closeSoftKeyboard());
        onView(ViewMatchers.withId(R.id.editTextText)).perform(typeText("Square"), closeSoftKeyboard());
        onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click());
        onView(ViewMatchers.withId(R.id.textView3)).check(ViewAssertions.matches(ViewMatchers.withText("100.0")));
        onView(ViewMatchers.withId(R.id.textView4)).check(ViewAssertions.matches(ViewMatchers.withText("40.0")));
    }

    @Test
    public void btncolor()
    {
        onView(ViewMatchers.withId(R.id.editTextText5)).perform(typeText("Red"), closeSoftKeyboard());
        onView(ViewMatchers.withId(R.id.button2)).perform(ViewActions.click());
        onView(ViewMatchers.withId(R.id.textView5)).check(ViewAssertions.matches(ViewMatchers.withText("Red")));

    }
}
