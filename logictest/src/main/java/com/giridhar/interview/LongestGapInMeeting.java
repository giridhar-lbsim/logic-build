package com.giridhar.interview;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;

public class LongestGapInMeeting {
	
	public int solution(String s) {
		// write your code in Java SE 8
		int minutePerDay = 1440;
		Map<String, Integer> dayMinuteStartMap = new HashMap<>();
		dayMinuteStartMap.put("Mon", 0);
		dayMinuteStartMap.put("Tue", minutePerDay);
		dayMinuteStartMap.put("Wed", 2 * minutePerDay);
		dayMinuteStartMap.put("Thu", 3 * minutePerDay);
		dayMinuteStartMap.put("Fri", 4 * minutePerDay);
		dayMinuteStartMap.put("Sat", 5 * minutePerDay);
		dayMinuteStartMap.put("Sun", 6 * minutePerDay);

		// Map<String, Integer> dayMinuteStartMap = Map.of("Mon",
		// 0,"Tue",minutePerDay,"Wed",2*minutePerDay,"Thu",3*minutePerDay,"Fri",4*minutePerDay,"Sat",5*minutePerDay,"Sun",6*minutePerDay);
		// list to hold meetings
		List<int[]> list = new ArrayList<>();
		Pattern p = Pattern.compile("(\\w{3}) (\\d{2}):(\\d{2})-(\\d{2}):(\\d{2})");
		// parsing input
		Arrays.stream(s.split("\n")).forEach(line -> {
			Matcher m = p.matcher(line);
			while (m.find()) {
				String day = m.group(1);
				int offSet = dayMinuteStartMap.get(day);
				String startHour = m.group(2);
				String startMinute = m.group(3);
				String endHour = m.group(4);
				String endMinute = m.group(5);
				int[] range = new int[2];
				range[0] = offSet + (Integer.parseInt(startHour) * 60) + Integer.parseInt(startMinute);
				range[1] = offSet + (Integer.parseInt(endHour) * 60) + Integer.parseInt(endMinute);
				list.add(range);

			}

		});
		List<int[]> sorted = list.stream().sorted(Comparator.comparing(a -> a[0])).collect(Collectors.toList());
		int max = 0;
		int lastMeetingEnd = 0;
		for (int[] meeting : sorted) {
			max = Math.max(max, meeting[0] - lastMeetingEnd);
			lastMeetingEnd = meeting[1];

		}
		int endOfTheWeek = dayMinuteStartMap.get("Sun") + (24 * 60);
		int lastMeetOfTheWeek = sorted.get(sorted.size() - 1)[1];
		max = Math.max(max, (endOfTheWeek - lastMeetOfTheWeek));
		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
