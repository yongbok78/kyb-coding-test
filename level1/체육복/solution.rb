def solution(n, lost, reserve)
  # 학생 체육복 초기화. 한벌씩 가지고 있다고 가정하고
  students = Array.new(n, 1)
  # 체육복 잃어버린 학생 확인
  lost.each do |v|
    students[v - 1] -= 1
  end
  # 체육복 여벌 있는 학생 확인
  reserve.each do |v|
    students[v - 1] += 1
  end
  # 다른 학생에게 체육복 빌려주기
  students.each_index do |i|
    if students[i] == 0
      if i - 1 > 0 and students[i - 1] == 2
        students[i - 1] -= 1
        students[i] += 1
      elsif i + 1 < n and students[i + 1] == 2
        students[i + 1] -= 1
        students[i] += 1
      end
    end
  end
  answer = n - students.count(0)
  return answer
end

p solution 5, [2, 4], [1, 3, 5]
p solution 5, [2, 4], [3]
p solution 3, [3], [1]
