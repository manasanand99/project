import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Calc2WheelerComponent } from './calc2-wheeler.component';

describe('Calc2WheelerComponent', () => {
  let component: Calc2WheelerComponent;
  let fixture: ComponentFixture<Calc2WheelerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Calc2WheelerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Calc2WheelerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
