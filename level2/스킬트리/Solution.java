import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (int i = 0; i < skill_trees.length; i++) {
            if (isSkillTree(skill, skill_trees[i]))
                answer++;
        }
        return answer;
    }

    private boolean isSkillTree(String skill, String skill_tree) {
        return skill.startsWith(skill_tree.replaceAll("[^" + skill + "]", ""));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));
    }
}
