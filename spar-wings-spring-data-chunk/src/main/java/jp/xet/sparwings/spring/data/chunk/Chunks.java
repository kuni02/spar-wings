/*
 * Copyright 2015-2016 Classmethod, Inc.
 * All Rights Reserved.
 *
 * NOTICE:  All source code, documentation and other information
 * contained herein is, and remains the property of Classmethod, Inc.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Classmethod, Inc.
 */
package jp.xet.sparwings.spring.data.chunk;

import java.util.Collections;

import lombok.experimental.UtilityClass;

/**
 * TODO for daisuke
 */
@UtilityClass
public class Chunks {
	
	@SuppressWarnings("rawtypes")
	public static final Chunk EMPTY_CHUNK = new ChunkImpl<>(Collections.emptyList(), null, null);
	
	
	@SuppressWarnings("unchecked")
	public static final <T>Chunk<T> emptyChunk() {
		return EMPTY_CHUNK;
	}
}
