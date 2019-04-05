package integration.test

import androidx.test.rule.ActivityTestRule
import com.google.samples.apps.sunflower.GardenActivity
import org.junit.Rule
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as isA


class AddFlowTest {

    @Rule
    @JvmField
    var gardenActivityTestRule = ActivityTestRule(GardenActivity::class.java)

    @Test
    fun addAppleToGarden() {
        
    }
}