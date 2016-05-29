VERSION 5.00
Object = "{6B7E6392-850A-101B-AFC0-4210102A8DA7}#1.3#0"; "COMCTL32.OCX"
Object = "{86CF1D34-0C5F-11D2-A9FC-0000F8754DA1}#2.0#0"; "MSCOMCT2.OCX"
Begin VB.Form frmAteCadHorario 
   BorderStyle     =   3  'Fixed Dialog
   Caption         =   "SIAG"
   ClientHeight    =   4155
   ClientLeft      =   45
   ClientTop       =   375
   ClientWidth     =   7845
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MDIChild        =   -1  'True
   MinButton       =   0   'False
   ScaleHeight     =   4155
   ScaleWidth      =   7845
   ShowInTaskbar   =   0   'False
   Begin ComctlLib.Toolbar tooAteCadHorIcone 
      Align           =   1  'Align Top
      Height          =   660
      Left            =   0
      TabIndex        =   8
      Top             =   0
      Width           =   7845
      _ExtentX        =   13838
      _ExtentY        =   1164
      ButtonWidth     =   1032
      ButtonHeight    =   1005
      Appearance      =   1
      ImageList       =   "ImageList1"
      _Version        =   327682
      BeginProperty Buttons {0713E452-850A-101B-AFC0-4210102A8DA7} 
         NumButtons      =   4
         BeginProperty Button1 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Object.Tag             =   "Novo"
            ImageIndex      =   1
         EndProperty
         BeginProperty Button2 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Object.Tag             =   "Editar"
            ImageIndex      =   2
         EndProperty
         BeginProperty Button3 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Object.Tag             =   "Salvar"
            ImageIndex      =   3
         EndProperty
         BeginProperty Button4 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Object.Tag             =   "Sair"
            ImageIndex      =   4
         EndProperty
      EndProperty
   End
   Begin VB.Frame fraAteCadHorario 
      Caption         =   "Cadastro de Horário"
      Height          =   3255
      Left            =   240
      TabIndex        =   0
      Top             =   720
      Width           =   7455
      Begin MSComCtl2.DTPicker DTPickerCadHor 
         BeginProperty DataFormat 
            Type            =   0
            Format          =   "yyyy-MM-dd"
            HaveTrueFalseNull=   0
            FirstDayOfWeek  =   0
            FirstWeekOfYear =   0
            LCID            =   1046
            SubFormatType   =   0
         EndProperty
         Height          =   375
         Left            =   1200
         TabIndex        =   9
         Tag             =   "OBRIGATORIO"
         Top             =   1680
         Width           =   2295
         _ExtentX        =   4048
         _ExtentY        =   661
         _Version        =   393216
         CustomFormat    =   "yyyy-MM-dd"
         Format          =   93978627
         CurrentDate     =   42517
         MaxDate         =   2958457
      End
      Begin VB.ComboBox cbxHora 
         Height          =   315
         Left            =   1200
         TabIndex        =   7
         Tag             =   "OBRIGATORIO"
         Top             =   2280
         Width           =   1695
      End
      Begin VB.TextBox txtAteCadHorCPF 
         Height          =   375
         Left            =   1200
         TabIndex        =   6
         Tag             =   "2RWERWERWERWERWE"
         Top             =   1080
         Width           =   2415
      End
      Begin VB.TextBox txtAteCadHorNome 
         Height          =   405
         Left            =   1200
         TabIndex        =   5
         Tag             =   "OBRIGATORIO"
         Top             =   480
         Width           =   4455
      End
      Begin ComctlLib.ImageList ImageList1 
         Left            =   6480
         Top             =   2520
         _ExtentX        =   1005
         _ExtentY        =   1005
         BackColor       =   -2147483643
         ImageWidth      =   32
         ImageHeight     =   32
         MaskColor       =   12632256
         _Version        =   327682
         BeginProperty Images {0713E8C2-850A-101B-AFC0-4210102A8DA7} 
            NumListImages   =   4
            BeginProperty ListImage1 {0713E8C3-850A-101B-AFC0-4210102A8DA7} 
               Picture         =   "frmAteCadHorario.frx":0000
               Key             =   ""
            EndProperty
            BeginProperty ListImage2 {0713E8C3-850A-101B-AFC0-4210102A8DA7} 
               Picture         =   "frmAteCadHorario.frx":11F582
               Key             =   ""
            EndProperty
            BeginProperty ListImage3 {0713E8C3-850A-101B-AFC0-4210102A8DA7} 
               Picture         =   "frmAteCadHorario.frx":1447F8
               Key             =   ""
            EndProperty
            BeginProperty ListImage4 {0713E8C3-850A-101B-AFC0-4210102A8DA7} 
               Picture         =   "frmAteCadHorario.frx":263D7A
               Key             =   ""
            EndProperty
         EndProperty
      End
      Begin VB.Label lblAteCadHorHora 
         Caption         =   "Hora"
         ForeColor       =   &H000000FF&
         Height          =   255
         Left            =   360
         TabIndex        =   4
         Top             =   2280
         Width           =   615
      End
      Begin VB.Label lblAteCadHorData 
         Caption         =   "Data"
         ForeColor       =   &H000000FF&
         Height          =   255
         Left            =   360
         TabIndex        =   3
         Top             =   1800
         Width           =   495
      End
      Begin VB.Label lblAteCadHorCPF 
         Caption         =   "CPF"
         ForeColor       =   &H00000000&
         Height          =   255
         Left            =   360
         TabIndex        =   2
         Top             =   1200
         Width           =   495
      End
      Begin VB.Label lblAteCadHorNome 
         Caption         =   "Nome"
         ForeColor       =   &H00000000&
         Height          =   255
         Left            =   360
         TabIndex        =   1
         Top             =   600
         Width           =   615
      End
   End
End
Attribute VB_Name = "frmAteCadHorario"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit

Private Sub novo()
    Call PG_LimpaForm(Me, txtAteCadHorNome)
End Sub
Private Sub Form_Load()
    cbxHora.AddItem "09:00", 0
    cbxHora.AddItem "10:00", 1
    cbxHora.AddItem "11:00", 2
    cbxHora.AddItem "12:00", 3
    cbxHora.AddItem "14:00", 4
    cbxHora.AddItem "15:00", 5
    cbxHora.AddItem "16:00", 6
    cbxHora.AddItem "17:00", 7
    cbxHora.AddItem "18:00", 8

End Sub

Private Sub tooAteCadHorIcone_ButtonClick(ByVal Button As ComctlLib.Button)
Select Case Button.Index
        Case 1
            novo
        Case 2
            'Abrir arquivo
        Case 3
            Dim adosisagenda As ADODB.Recordset
            Dim sql As String
            Dim dia As String
            Dim mes As String
            Dim ano As String
            Dim data As Date
            dia = DTPickerCadHor.Day
            mes = DTPickerCadHor.Month
            ano = DTPickerCadHor.Year
            data = DTPickerCadHor.Value
            
            MsgBox (data)
        Case 4
            Unload frmAteCadHorario
    End Select
End Sub

Private Sub txtAteCadHorCPF_KeyPress(KeyAscii As Integer)
    KeyAscii = FG_BloqueiaTeclado(CG_BLOQUEIATECLADO_SOMENTENUMEROS, KeyAscii)
End Sub

Private Sub txtAteCadHorTelefone_KeyPress(KeyAscii As Integer)
    KeyAscii = FG_BloqueiaTeclado(CG_BLOQUEIATECLADO_SOMENTENUMEROS, KeyAscii)
End Sub

Private Sub Salvar()
    If FG_ValidaForm(Me) Then
    End If
End Sub

