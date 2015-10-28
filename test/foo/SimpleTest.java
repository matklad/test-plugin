package foo;

import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;
import junit.framework.Assert;

public class SimpleTest extends LightCodeInsightFixtureTestCase {

    public void testFoo() {
        Foo foo = new Foo();
        Assert.assertTrue(true);
    }
}
