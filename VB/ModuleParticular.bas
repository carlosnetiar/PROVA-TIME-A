Attribute VB_Name = "ModuleParticular"
Option Explicit

Public Const CG_BLOQUEIATECLADO_SOMENTENUMEROS = 0
Public Const CG_BLOQUEIATECLADO_SOMENTELETRAS = 1

Public Sub PG_LimpaForm(ByRef formulario As Form, ByRef textboxfocus As TextBox)
    Dim elements As Object
    For Each elements In formulario
        If (TypeName(elements) = "TextBox") Then
            elements.Text = ""
        End If
    Next
    textboxfocus.SetFocus
End Sub

Public Function FG_BloqueiaTeclado(ByVal tipo As Integer, ByVal KeyAscii As Integer) As Integer
    Select Case tipo
        Case CG_BLOQUEIATECLADO_SOMENTENUMEROS
            If Not ((KeyAscii >= 48) And (KeyAscii <= 57)) Then
                FG_BloqueiaTeclado = 0
                Exit Function
            End If
    End Select
    FG_BloqueiaTeclado = KeyAscii
End Function

Public Function FG_ValidaForm(ByRef formulario As Form) As Boolean
    Dim elements As Object
    FG_ValidaForm = True
    For Each elements In formulario
        If (TypeName(elements) = "TextBox") Then
            If (elements.Tag = "OBRIGATORIO") And (elements.Text = "") Then
                MsgBox "Um dos campos obrigatórios foi deixado em branco", vbCritical + vbOKOnly, App.Title
                elements.SetFocus
                FG_ValidaForm = False
                Exit Function
            End If
        End If
    Next
End Function
