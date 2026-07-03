package com.tshaped2;

import java.util.UUID;

public class IDGenerator {
public static String generateUniqueId() {
	return UUID.randomUUID().toString();
}
}
