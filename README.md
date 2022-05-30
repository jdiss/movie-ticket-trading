# Movie Tickets
## The Coding Test
In a world of Netflicks, Hoolu, Amayzon Prime and other video streaming services, movie watching customers are dwindling. The powers that be
have decided to slash movie ticket prices to entice customers back into cinemas. We have been tasked to build an application that reports the
projected cost of movie tickets from historical customer transaction to inform decision making around ticket pricing.
Requirements
### There are four types of movie tickets
- Adult: For customers 18 years and older but less than 65 years old. Costs $25. 
  
- Senior: For customers 65 years and older. 30% cheaper than Adult tickets
    
- Teen: For customers 11 years and older but less than 18 years old. Costs $12
    
- Children: For customers less than 11 years of age. Costs $5. 
  
- If there are 3 or more Children's tickets in a transaction, there's a 25% discount applied to the cost of Children's tickets

Your task is to implement a java application which will expose an API call to take transaction as input and return below information:
The ID of the transaction
Each individual type of movie ticket present in that transaction, ordered alphabetically, and it's quantity and total cost
The total cost of all movie tickets for that transaction

### Feature to be added

- Unit test
- Integration Test for service level
- Model and Calculation Validation
- Custom exception bind to Http response
- Error Handling
- Currency display with unit 

