[0,1,2,3,4,5,6,7,8,9].permutations().each { x ->
if (((x[0]*10 + x[1]) - (x[2]*10+x[3]) == x[4]*10+x[5]) &&  ((x[4]*10 + x[5]) + (x[6]*10+x[7]) == x[8]*100+x[8]*10+x[8]) && x[0] > 0 && x[2] > 0 && x[4] > 0 && x[6] > 0 && x[8] > 0) 
	println "a: ${x[0]} b: ${x[1]} c: ${x[2]} d: ${x[3]} e: ${x[4]} f: ${x[5]} g: ${x[6]} h: ${x[7]} p: ${x[8]}"
}
