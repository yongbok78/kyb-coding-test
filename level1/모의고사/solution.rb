def solution(answers)
  s1 = [1, 2, 3, 4, 5]
  s2 = [2, 1, 2, 3, 2, 4, 2, 5]
  s3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
  scores = [0, 0, 0]
  answers.each_with_index do |v, i|
    scores[0] += 1 if v == s1[i % s1.length]
    scores[1] += 1 if v == s2[i % s2.length]
    scores[2] += 1 if v == s3[i % s3.length]
  end
  answer = []
  max_socore = scores.max
  scores.each_with_index do |v, i|
    if max_socore == v
      answer << i + 1
    end
  end
  return answer
end

p solution [1, 2, 3, 4, 5]
p solution [1, 3, 2, 4, 2]
