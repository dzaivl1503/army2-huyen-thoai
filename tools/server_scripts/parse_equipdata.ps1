param($path = "C:\Users\Admin\Desktop\mobi-army2\mobi-army2\cache_backup\equipdata2")
$bytes = [System.IO.File]::ReadAllBytes($path)
Write-Host "file: $path, size: $($bytes.Length)"

$ms = [System.IO.MemoryStream]::new($bytes)
$br = [System.IO.BinaryReader]::new($ms)

function Read-BE-Byte { $br.ReadByte() }
function Read-BE-Short { 
    $b = $br.ReadBytes(2)
    [Array]::Reverse($b)
    [BitConverter]::ToInt16($b, 0)
}
function Read-BE-Int { 
    $b = $br.ReadBytes(4)
    [Array]::Reverse($b)
    [BitConverter]::ToInt32($b, 0)
}

$nBig = Read-BE-Byte
Write-Host "nBigImage: $nBig"
for ($n3 = 0; $n3 -lt $nBig; $n3++) {
    $by2 = Read-BE-Byte
    $s1 = Read-BE-Short
    $by2_2 = Read-BE-Byte
    for ($n = 0; $n -lt $by2_2; $n++) {
        $by = Read-BE-Byte
        $n4 = Read-BE-Byte
        for ($i = 0; $i -lt $n4; $i++) {
            $s = Read-BE-Short
            $by3 = 0
            if ($by -eq 0) { $by3 = Read-BE-Byte }
            $s2 = Read-BE-Short
            $by4 = Read-BE-Byte
            for ($j = 0; $j -lt 6; $j++) {
                $null = Read-BE-Short
                $null = Read-BE-Short
                $null = Read-BE-Byte
                $null = Read-BE-Byte
                $null = Read-BE-Byte
                $null = Read-BE-Byte
            }
            for ($j = 0; $j -lt 10; $j++) {
                $null = Read-BE-Byte
            }
        }
    }
}
Write-Host "Finished parsing equips. Position: $($ms.Position)"
$lentIcon = Read-BE-Short
Write-Host "Lent Icon: $lentIcon"
$iconBytes = $br.ReadBytes($lentIcon)
$w = [BitConverter]::ToInt32(@($iconBytes[19], $iconBytes[18], $iconBytes[17], $iconBytes[16]), 0)
$h = [BitConverter]::ToInt32(@($iconBytes[23], $iconBytes[22], $iconBytes[21], $iconBytes[20]), 0)
Write-Host "Read iconBytes, Position: $($ms.Position), Dimensions: ${w}x${h}"
for ($n2 = 0; $n2 -lt 10; $n2++) {
    $s3 = Read-BE-Short
    Write-Host "EquipSlotSet.b[$n2] len: $s3"
    $imgBytes = $br.ReadBytes($s3)
}
Write-Host "Position after 10 slots: $($ms.Position) / $($bytes.Length)"
if ($ms.Position -lt $bytes.Length) {
    $byFinal = Read-BE-Byte
    $dummyInt = Read-BE-Int
    Write-Host "Final byte: $byFinal, dummyInt: $dummyInt"
    for ($n = 0; $n -lt $byFinal; $n++) {
        $n5 = Read-BE-Int
        Write-Host "EquipScreen img[$n] len: $n5"
        $imgBytes = $br.ReadBytes($n5)
        $hex = [BitConverter]::ToString($imgBytes, 0, [Math]::Min(8, $imgBytes.Length))
        Write-Host "  header: $hex"
    }
}
Write-Host "Final position: $($ms.Position) / $($bytes.Length)"
