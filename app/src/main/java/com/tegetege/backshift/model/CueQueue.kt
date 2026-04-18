package com.tegetege.backshift.model

import kotlin.collections.ArrayDeque

/**
 * A simple Queue of Cues.
 */
class CueQueue {
    // 1. We declare 'queue' as a private property
    private val queue = ArrayDeque<Cue>()

    // 2. We don't need a constructor since we initialized above.
    
    fun enqueue(cue: Cue) {
        queue.addLast(cue)
    }

    fun dequeue(): Cue? {
        return queue.removeFirstOrNull()
    }

    fun getCue(): Cue? {
        return queue.firstOrNull()
    }
}
