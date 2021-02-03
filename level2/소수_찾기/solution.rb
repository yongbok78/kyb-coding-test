require "prime"

def solution(numbers)
  n_set = Set.new
  (1..numbers.size).each do |i|
    n_set.merge(numbers.chars.permutation(i).map { |a| a.join.to_i })
  end
  n_set.to_a.select { |n| Prime.prime?(n) }.size
end

p solution "17"
p solution "011"
