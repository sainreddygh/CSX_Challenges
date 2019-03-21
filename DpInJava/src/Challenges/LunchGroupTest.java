package Challenges;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LunchGroupTest {
	@Test
	public void testLunchGroup() {
		LunchGroup lg =  new LunchGroup();
		List<String> input =  new ArrayList();
		assertThat("Empty", lg.getRandomGroups(input).size()==0);
		input.add("5");
		input.add("15");
		input.add("12");
		assertThat("SingleList", lg.getRandomGroups(input).size()==1);
		input.add("5");
		input.add("15");
		input.add("12");
		input.add("15");
		input.add("12");
		input.add("15");
		input.add("12");
		assertThat("SingleList", lg.getRandomGroups(input).size()==2);
	}

}
