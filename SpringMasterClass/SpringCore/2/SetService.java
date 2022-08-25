package assignment.springcore.assignment.springcore.second;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class SetService implements MethodReturn {

	@Override
	public Object valueReturn(Question q) {
		
		Set<Question> s = new HashSet();
		s.add(q);
		return q;
	}

	

}
