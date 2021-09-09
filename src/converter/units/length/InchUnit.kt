package converter.units.length

class InchUnit(override val length: Double) : LengthUnit() {
    override val type: LengthUnitType
        get() = LengthUnitType.INCH
    override val abbreviated: String
        get() = "in"
    override val oneUnit: String
        get() = "inch"
    override val manyUnits: String
        get() = "inches"
    override val toMeters: Double
        get() = length.times(0.0254)
}