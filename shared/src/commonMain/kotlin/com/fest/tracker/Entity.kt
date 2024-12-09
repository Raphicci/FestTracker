package com.fest.tracker

import kotlinx.serialization.Serializable
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime

// TODO could had an address field
@Serializable
data class Festival(
    val id: String,
    val name: String,
    val stages: List<Stage>,
    val dates: List<LocalDate>,
    val festivities: List<Festivity>
)

@Serializable
data class Stage(
    val id: String,
    val name: String,
)

@Serializable
data class TimeTableSlot(
    val date: LocalDate,
    val startTime: LocalDateTime?,
    val endTime: LocalDateTime?,
)

@Serializable
data class Festivity(
    val name: String,
    val type: FestivityType = FestivityType.BAND,
    val stage: Stage?,
    val slot: TimeTableSlot?,
)

// TODO for now this is the default
@Serializable
enum class FestivityType {
    BAND
}