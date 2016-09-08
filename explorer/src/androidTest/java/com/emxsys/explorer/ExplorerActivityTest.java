/*
 * MIT License
 *
 * Copyright (c) 2016 Bruce Schubert
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.emxsys.explorer;

import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Instrumentation tests for a simple WorldWindow globe using Expresso.
 * <p/>
 * Unit tests generally follow a Assemble, Act, Assert pattern.
 * <p/>
 * See YouTube tutorial for expresso: https://www.youtube.com/watch?v=TGU0B4qRlHY
 */
@RunWith(AndroidJUnit4.class)
public class ExplorerActivityTest {

    /**
     * Launches the ExplorerActivity for every test.
     */
    @Rule
    public final ActivityTestRule<ExplorerActivity> activityRule = new ActivityTestRule<>(ExplorerActivity.class);

    @Test
    public void shouldBeAbleToCreateGlobe() {
        onView(withId(R.id.explorer_text)).check(ViewAssertions.matches(isDisplayed()));
    }

}
