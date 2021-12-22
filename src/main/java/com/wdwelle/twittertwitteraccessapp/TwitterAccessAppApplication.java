package com.wdwelle.twittertwitteraccessapp;

import twitter4j.TwitterException;

public class TwitterAccessAppApplication {

	public static void main(String[] args) {
		try {
			Application.createTweet("I wrote this from twitter API yay me!");
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
