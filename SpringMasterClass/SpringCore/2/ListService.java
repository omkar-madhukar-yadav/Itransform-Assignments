package assignment.springcore.assignment.springcore.second;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ListService implements MethodReturn {

	@Override
	public Object valueReturn(Question q) {
		
		List<Question> li = new ArrayList();
		
		li.add(q);
		return li;
	}

	
	

}
