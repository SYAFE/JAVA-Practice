
// ChildView.cpp : CChildView Ŭ������ ����
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



// CChildView �޽��� ó����

BOOL CChildView::PreCreateWindow(CREATESTRUCT& cs) 
{
	if (!CWnd::PreCreateWindow(cs))
		return FALSE;

	cs.dwExStyle |= WS_EX_CLIENTEDGE;
	cs.style &= ~WS_BORDER;
	cs.lpszClass = AfxRegisterWndClass(CS_HREDRAW|CS_VREDRAW|CS_DBLCLKS, 
		::LoadCursor(NULL, IDC_ARROW), (HBRUSH)GetStockObject(GRAY_BRUSH) /* â ���� ���� */ , NULL);

	return TRUE;
}

void CChildView::OnPaint() 
{
	CPaintDC dc(this); // �׸��⸦ ���� ����̽� ���ؽ�Ʈ�Դϴ�.
	dc.Rectangle(0, 0, 200, 100);
	dc.SetMapMode(MM_HIMETRIC);
	dc.Rectangle(0, 0, 200, -100);
	
	//CRect rect;
	//GetClientRect(&rect);
	//dc.SetMapMode(MM_ANISOTROPIC);  // â�� ���� ����� ũ��
	//dc.SetWindowExt(100, 100);
	//dc.SetViewportExt(rect.Width(), rect.Height());
	//dc.RoundRect(0, 0, 100, 100, 50, 50);
	//dc.DrawEdge(CRect(20, 20, 80, 80), BDR_SUNKENINNER | BDR_RAISEDOUTER, BF_RECT);

	//dc.TextOutW(100, 50, _T("���ϰ���"));
	//dc.SetBkMode(TRANSPARENT);  // �Է� ���� ����ȭ
	//dc.TextOutW(100, 100, _T("��ǻ�ͽý��۰�"));
	//dc.SetTextColor(RGB(255, 0, 0));  // �ؽ�Ʈ ���� ����
	//dc.TextOutW(100, 150, _T("A��"));

	// TODO: ���⿡ �޽��� ó���� �ڵ带 �߰��մϴ�.
	
	// �׸��� �޽����� ���ؼ��� CWnd::OnPaint()�� ȣ������ ���ʽÿ�.
}

