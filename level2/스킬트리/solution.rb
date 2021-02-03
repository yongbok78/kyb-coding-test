def solution(skill, skill_trees)
  answer = 0
  skill_trees.each { |st| answer += 1 if skill.start_with? st.gsub(Regexp.new("[^#{skill}]"), "") }
  return answer
end

p solution "CBD", ["BACDE", "CBADF", "AECB", "BDA"]
