package com.startagy.demo.behaviour.demo;

import com.startagy.demo.behaviour.Duck;
import com.startagy.demo.behaviour.GraphicalDisplayBehaviour;
import com.startagy.demo.behaviour.NoFlyBehaviour;
import com.startagy.demo.behaviour.NoQuckBehaviour;
import com.startagy.demo.behaviour.SimpleFlyBehaviour;
import com.startagy.demo.behaviour.SimpleQuckBehaviour;
import com.startagy.demo.behaviour.TextualDisplayBehaviour;

public class StrategyDuckDemo {

	public static void main(String[] args) {
Duck duckType1=new Duck(new SimpleQuckBehaviour(), new SimpleFlyBehaviour(), new TextualDisplayBehaviour());
Duck duckType2=new Duck(new NoQuckBehaviour(), new SimpleFlyBehaviour(), new TextualDisplayBehaviour());
Duck duckType3=new Duck(new NoQuckBehaviour(), new NoFlyBehaviour(), new TextualDisplayBehaviour());
Duck duckType4=new Duck(new NoQuckBehaviour(), new NoFlyBehaviour(), new GraphicalDisplayBehaviour());
		
	}

}
