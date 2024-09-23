/**
 * Finds how much logs a truck can carry if the max weight it can carry is 1100 kg and each log is 20 kg/m
 * 
 * By: Justin Lavoie
 * Version: 1.0
 * Since: 2024-09-19
 */ 


import { createPrompt } from 'bun-promptx'

const maxweight = 1100
const weightperlog = 20

const numlogs = createPrompt('Choose the length of the logs that you would like to move with a truck (in meters)? (0.25, 0.5 ,1):  ')

let logLength = parseFloat(numlogs.value)
let Amount = maxweight / (weightperlog * logLength)

console.log(`The truck can carry ${Amount} logs if they are ${logLength}m long.`)

console.log('\nDone')