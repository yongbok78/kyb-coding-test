def solution(array, commands)
  answer = []
  commands.each do |c|
    arr = array[c[0] - 1..c[1] - 1]
    arr.sort!
    answer << arr[c[2] - 1]
  end
  return answer
end

p solution [1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
