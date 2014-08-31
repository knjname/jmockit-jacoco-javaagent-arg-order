package knjname;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import mockit.Deencapsulation;
import mockit.Expectations;
import mockit.Mocked;
import mockit.NonStrictExpectations;

import org.junit.Test;

public class AddRandomTest {

	@Test
	public void testAddRandom(@Mocked("random") Math math){
		new NonStrictExpectations() {{
			Math.random(); result = 3.3;
		}};
		
		assertThat(AddRandom.addRandom(3.7), is(7.0));
	}
	
}
