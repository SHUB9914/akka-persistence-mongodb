import de.johoop.cpd4sbt.ReportType.{XML}
import de.johoop.cpd4sbt._

//------------------------------------
// Setup cpd for sbt
// Invocation: sbt cpd
// See: https://github.com/sbt/cpd4sbt
//------------------------------------

enablePlugins(CopyPasteDetector)

cpdReportType := XML

cpdReportName := "cpd.xml"

cpdTargetPath := target(_ / "cpd").value

cpdLanguage := Language.Scala
