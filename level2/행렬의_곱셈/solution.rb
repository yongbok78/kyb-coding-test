def solution(arr1, arr2)
  answer = Array.new(arr1.size) { Array.new(arr2[0].size) { 0 } }
  arr1.size.times do |i|
    arr2.size.times do |k|
      arr2[0].size.times do |j|
        answer[i][j] += arr1[i][k] * arr2[k][j]
      end
    end
  end
  return answer
end

p solution [[1, 4], [3, 2], [4, 1]], [[3, 3], [3, 3]]
p solution [[2, 3, 2], [4, 2, 4], [3, 1, 4]], [[5, 4, 3], [2, 4, 1], [3, 1, 1]]
