/* Demostractor allocation problem
 * This file is written for grammar testing purpose only
 * Author: haowu (haowu@cs.nuim.ie)
 */

/* A small specification for NUIM CS department */
Spec: NUIM_CS_DEPT {
	/* this section is for building the structure of your finite resource and tasks */
	Struct: Resource {
		modules=["CS151","CS320","CS310","CS355","CS370","CS143"]
		postgrad=["haowu","keith","marrie","lingfei","zhengcheng"]
		undergrad=["jack","shelly","luke"]
		head=["haowu","luke"]
		empty=[]
		demostrators=postgrad+undergrad+head+empty as demo
		//everyone=[postgrad , undergrad ,["ricky","fangli"], empty]
		
		time=["09:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00"]
		week=["monday","tuesday","wednesday","thursday","friday"]
		location=["lab1","lab2","lab3","lab4"]
		
		/* establish relations between modules, time and location */
		/*time_table=[
			{modules["CS151"],modules["CS320"]}=>{time["09:00"],week["monday"],location["Lab3"]},
			{modules["CS151"],modules["CS320"]}=>{time["10:00"],week["monday"],location["lab3"]},
			modules["CS357"]=>{time["12:00"],week["tuesday"],location["lab4"]},
			{modules["CS357"]}=>{time["13:00"],week["tuesday"],location["lab4"]}
		]*/

		/* a short way */
		time_table=[
			{"CS151","CS320"}=>{"09:00","monday","lab3"},
			{"CS151","CS320"}=>{"10:00","monday","lab3"},
			{"CS357"}=>{"12:00","tuesday","lab4"},
			"CS357"=>{"13:00","tuesday","lab4"}
		]
		/* missing conditions here. */
		//demo => time_table
		//not everyone in time_table[:] for 2
	}

	/* this section specifies your inital plan (plan could be multiple) */
	Plan: PlanA{
		fixed rule rx: * of demo.postgrad in time_table[*] //only looking at time, date & location
		fixed rule r1: * of demo.postgrad in time_table[:{"09:00","monday","lab3"}] and time_table[:{"10:00","monday","lab3"}] //only looking at time, date & location
		fixed rule r3: * of demo in time_table["CS151":] // only looking at module
		rule r5: 2 of demo in time_table[{"CS357"}:{"12:00","tuesday","lab4"}] // looking at both time & modules
		rule r6: demo.postgrad["haowu"] in time_table[{"CS357"}:{"12:00","tuesday","lab4"}] //this should be allowed
		relaxed rule r7: demo.postgrad["haowu"] with time_table[:] for 7 // for 7 hours
		relaxed rule r4: 1 of demo.head in time_table[:] // every lab has a head demonstrator
	}
	
	Plan: PlanB{
		+ of postgrad in time_table[{week["monday"],time["09:00"],location["lab3"]}] //at least one of posgrad has to be in this time slot.
	}
		
	/* this section asks solver to find all doable plans */
	/* find me two plans */
	/* find PlanA */
	print PlanA("xml") // this gives you both solving and printing services
	//find PlanB
}

