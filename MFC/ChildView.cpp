
// ChildView.cpp : CChildView 클래스의 구현
//

#include "stdafx.h"
#include "MappingMode.h"
#include "ChildView.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#endif


// CChildView

CChildView::CChildView()
{
}

CChildView::~CChildView()
{
}


BEGIN_MESSAGE_MAP(CChildView, CWnd)
	ON_WM_PAINT()
END_MESSAGE_MAP()



// CChildView 메시지 처리기

BOOL CChildView::PreCreateWindow(CREATESTRUCT& cs) 
{
	if (!CWnd::PreCreateWindow(cs))
		return FALSE;

	cs.dwExStyle |= WS_EX_CLIENTEDGE;
	cs.style &= ~WS_BORDER;
	cs.lpszClass = AfxRegisterWndClass(CS_HREDRAW|CS_VREDRAW|CS_DBLCLKS, 
		::LoadCursor(NULL, IDC_ARROW), (HBRUSH)GetStockObject(GRAY_BRUSH) /* 창 배경색 변경 */ , NULL);

	return TRUE;
}

void CChildView::OnPaint() 
{
	CPaintDC dc(this); // 그리기를 위한 디바이스 컨텍스트입니다.
	dc.Rectangle(0, 0, 200, 100);
	dc.SetMapMode(MM_HIMETRIC);
	dc.Rectangle(0, 0, 200, -100);
	
	//CRect rect;
	//GetClientRect(&rect);
	//dc.SetMapMode(MM_ANISOTROPIC);  // 창에 대해 상대적 크기
	//dc.SetWindowExt(100, 100);
	//dc.SetViewportExt(rect.Width(), rect.Height());
	//dc.RoundRect(0, 0, 100, 100, 50, 50);
	//dc.DrawEdge(CRect(20, 20, 80, 80), BDR_SUNKENINNER | BDR_RAISEDOUTER, BF_RECT);

	//dc.TextOutW(100, 50, _T("인하공전"));
	//dc.SetBkMode(TRANSPARENT);  // 입력 배경색 투명화
	//dc.TextOutW(100, 100, _T("컴퓨터시스템과"));
	//dc.SetTextColor(RGB(255, 0, 0));  // 텍스트 색상 변경
	//dc.TextOutW(100, 150, _T("A반"));

	// TODO: 여기에 메시지 처리기 코드를 추가합니다.
	
	// 그리기 메시지에 대해서는 CWnd::OnPaint()를 호출하지 마십시오.
}

