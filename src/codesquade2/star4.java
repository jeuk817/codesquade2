package codesquade2;


class Solution {
	public long solution(int a, int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		int answer = 0;
		for (int i = min; i <= max; i++) {
			answer += i;
		}
		      return answer;
	}
		
}