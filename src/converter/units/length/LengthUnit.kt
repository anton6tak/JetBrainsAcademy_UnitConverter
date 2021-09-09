package converter.units.length

import converter.units.Unit

abstract class LengthUnit : Unit{
    abstract val type : LengthUnitType
    abstract val length: Double
    abstract val abbreviated: String
    abstract override val oneUnit: String
    abstract override val manyUnits: String
    abstract val toMeters: Double
    val name: String
        get() = if (length == 1.0) oneUnit else manyUnits
}