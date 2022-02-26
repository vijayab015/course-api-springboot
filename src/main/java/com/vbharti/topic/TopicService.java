package com.vbharti.topic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topics =new ArrayList<>( Arrays.asList(

			new Topic("java", "Spring Framework", "Spring Framework discription"),
			new Topic("Spring", "Spring Framework", "Spring Framework discription"),
			new Topic("java", "Core java", "Core java discription"),
			new Topic("java script", "java script", "java script discription")

	));

	public List<Topic> getAllTopics() {
		return topics;

	}
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		
		topics.add(topic);
	}
	public void updateTopi(String id, Topic topic) {
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
		}
		
	}
	public void deletTopic(String id) {
		topics.removeIf(t-> t.getId().equals(id));
	}

}
