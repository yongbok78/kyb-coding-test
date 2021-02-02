def solution(arr1, arr2)
  arr1.each_index do |i|
    arr1[0].each_index do |j|
      arr1[i][j] += arr2[i][j]
    end
  end
  return arr1
end

p solution [[1, 2], [2, 3]], [[3, 4], [5, 6]]
p solution [[1], [2]], [[3], [4]]
